package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L06_function_composition;

/*
You must implement the chain of responsibility pattern in the functional style
for stage-by-stage request creating.

1) Write the RequestHandler interface with a single abstract method called
handle and one default method; the first method is needed to use lambda
expressions. It should accept a Request object and then return a new Request
with changed data. The second method is used to combine several handlers into a
single one.

2) Create commonRequestHandler that is combined from three existing handlers:
wrapInTransactionTag, createDigest and wrapInRequestTag.
*/

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Scanner;

class ChainOfResponsibilityDemo {

    static RequestHandler wrapInTransactionTag = req ->
            new Request(String.format("<transaction>%s</transaction>", req.getData()));

    static RequestHandler createDigest = req -> {
        String digest = "";
        try {
            final MessageDigest md5 = MessageDigest.getInstance("MD5");
            final byte[] digestBytes = md5.digest(req.getData().getBytes("UTF-8"));
            digest = new String(Base64.getEncoder().encode(digestBytes));
        } catch (Exception ignored) {
            System.out.println("An error occurred");
        }
        return new Request(req.getData() + String.format("<digest>%s</digest>", digest));
    };

    static RequestHandler wrapInRequestTag = req ->
            new Request(String.format("<request>%s</request>", req.getData()));

    static RequestHandler commonRequestHandler = req -> wrapInTransactionTag.combine(createDigest).combine(wrapInRequestTag).handle(req);// !!! write a combination of existing handlers here

    @FunctionalInterface
    interface RequestHandler {

        Request handle(Request request);

        default RequestHandler combine(RequestHandler otherRequest) {
            return req -> otherRequest.handle(this.handle(req));
        }
    }

    static class Request {
        private final String data;

        public Request(String requestData) {
            this.data = requestData;
        }

        public String getData() {
            return data;
        }
    }

    public static void main(String[] args) throws Exception {

        final Scanner scanner = new Scanner(System.in);

        final String requestData = scanner.nextLine();

        final Request notCompletedRequest = new Request(requestData);

        System.out.println(commonRequestHandler.handle(notCompletedRequest).getData());
    }
}
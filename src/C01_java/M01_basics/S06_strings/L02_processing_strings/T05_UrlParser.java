package C01_java.M01_basics.S06_strings.L02_processing_strings;

/*
You want to hack a website now. First, get all the available parameters that
you can find in the URL. Then print them in the "key : value" format. If a
parameter doesn't have value, print "not found".

If you find the password (parameter pass), you should print its value after all
parameters once again, but with a key password. If a URL does not contain
parameter pass, do not print anything after the listed parameters. However, if
pass parameter is present, its value cannot be empty.
*/

import java.util.Scanner;

class T05_UrlParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine().split("\\?")[1];

        String[] params = url.split("[=&]");

        Integer password = null;

        for (int i = 0; i < params.length; i += 2) {
            if ("pass".equals(params[i])) {
                password = Integer.parseInt(params[i + 1]);
            }
            if ("".equals(params[i + 1])) {
                params[i + 1] = "not found";
            }

            System.out.println(params[i] + " : " + params[i + 1]);
        }

        if (password != null) {
            System.out.println("password : " + password);
        }
    }
}

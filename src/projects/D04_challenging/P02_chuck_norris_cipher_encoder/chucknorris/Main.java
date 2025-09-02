package projects.D04_challenging.P02_chuck_norris_cipher_encoder.chucknorris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        runMenu(sc);
        sc.close();
    }

    private static void runMenu(Scanner sc) {
        while (true) {
            String option = getOption(sc);
            if (runOption(sc, option)) return;
            System.out.println();
        }
    }

    private static boolean runOption(Scanner sc, String option) {
        switch (option) {
            case "encode" -> encode(sc);
            case "decode" -> decode(sc);
            case "exit" -> {
                System.out.println("Bye!");
                return true;
            }
            default -> System.out.printf("There is no '%s' operation\n", option);
        }
        return false;
    }

    private static boolean isSymbolsValid(String encodedInput) {
        char[] chars = encodedInput.toCharArray();
        for (char ch : chars) {
            if (ch != '0' && ch != ' ') return true;
        }

        return false;
    }

    private static void encode(Scanner sc) {
        String decodedInput = getInput(sc, "Input string:");

        System.out.println("Encoded string:");

        String encodedString = encodeToChuckNorris(decodedInput);

        System.out.println(encodedString);
    }

    private static String getOption(Scanner sc) {
        System.out.println("Please input operation (encode/decode/exit):");
        return sc.nextLine();
    }

    private static void decode(Scanner sc) {
        String encodedInput = getInput(sc, "Input encoded string:");
        if (isInputValid(encodedInput)) {
            printError();
            return;
        }
        String decodedString = decodeFromChuckNorris(encodedInput);
        printDecodedString(decodedString);
    }

    private static void printDecodedString(String decodedString) {
        System.out.println("Decoded string:" + "\n" + decodedString);
    }

    private static String decodeFromChuckNorris(String encodedInput) {
        String[] encodedBlocks = getEncodedBlocks(encodedInput);

        char[] bits = getBits(encodedBlocks);

        String[] binaryBlocks = getBinaryBlocks(bits);

        char[] decodedChars = getDecodedChars(binaryBlocks);

        return getDecodedString(decodedChars);
    }

    private static boolean isInputValid(String encodedInput) {
        return isSymbolsValid(encodedInput) || isFirstBlockValid(encodedInput) || isEven(encodedInput) || isEnoughBits(encodedInput);
    }

    private static boolean isEnoughBits(String input) {
        String[] blocks = input.split(" ");
        int bitsCount = 0;
        for (int i = 1; i < blocks.length; i += 2) {
            bitsCount += blocks[i].length();
        }
        return bitsCount % 7 != 0;
    }

    private static boolean isEven(String input) {
        String[] blocks = input.split(" ");
        return blocks.length % 2 != 0;
    }

    private static boolean isFirstBlockValid(String input) {
        String[] blocks = input.split(" ");
        for (int i = 0; i < blocks.length; i += 2) {
            if (!"0".equals(blocks[i]) && !"00".equals(blocks[i])) {
                return true;
            }
        }
        return false;
    }

    private static void printError() {
        System.out.println("Encoded string is not valid.");
    }

    private static String getDecodedString(char[] decodedChars) {
        StringBuilder decodedString = new StringBuilder();
        for (char ch : decodedChars) {
            decodedString.append(ch);
        }
        return decodedString.toString();
    }

    private static char[] getDecodedChars(String[] binaryBlocks) {
        char[] chars = new char[binaryBlocks.length];
        int ind = 0;
        for (String block : binaryBlocks) {
            chars[ind++] = (char) Integer.parseInt(block, 2);
        }
        return chars;
    }

    private static String[] getBinaryBlocks(char[] bits) {
        String[] binaryBlocks = new String[bits.length / 7];
        int ind = 0;
        for (int i = 0; i < bits.length; i += 7) {
            StringBuilder binaryBlock = new StringBuilder();
            for (int j = i; j < 7 + i; j++) {
                binaryBlock.append(bits[j]);
            }
            binaryBlocks[ind++] = binaryBlock.toString();
        }
        return binaryBlocks;
    }

    private static char[] getBits(String[] blocksOfTwo) {
        StringBuilder binaryString = new StringBuilder();

        for (String block : blocksOfTwo) {
            String[] blockOfTwoElements = block.split(" ");
            char bitType = "00".equals(blockOfTwoElements[0]) ? '0' : '1';
            int bitCount = blockOfTwoElements[1].length();
            binaryString.repeat(bitType, bitCount);
        }
        return binaryString.toString().toCharArray();
    }

    private static String[] getEncodedBlocks(String input) {
        String[] blocks = input.split(" ");
        String[] encodedBlocks = new String[0];
        for (int i = 0; i < blocks.length; i += 2) {
            String encodedBlock = blocks[i] + " " + blocks[i + 1];
            encodedBlocks = addToArray(encodedBlocks, encodedBlock);
        }
        return encodedBlocks;
    }

    private static String[] addToArray(String[] blocksOfTwo, String newElement) {
        String[] tmpArr = new String[blocksOfTwo.length + 1];
        System.arraycopy(blocksOfTwo, 0, tmpArr, 0, blocksOfTwo.length);
        tmpArr[blocksOfTwo.length] = newElement;
        return tmpArr;
    }

    private static String encodeToChuckNorris(String input) {
        StringBuilder cipher = new StringBuilder();

        int count = 0;
        char prev = 0;
        boolean isFirst = true;

        for (char ch : input.toCharArray()) {
            String binaryString = getBinaryString(ch);
            System.out.print(binaryString + " ");
            for (char binCh : binaryString.toCharArray()) {
                if (binCh != prev && !isFirst) {
                    appendRun(cipher, prev, count);
                    count = 0;
                }
                isFirst = false;
                count++;
                prev = binCh;
            }
        }
        System.out.println();
        appendRun(cipher, prev, count);
        return cipher.toString();
    }

    private static String getInput(Scanner sc, String str) {
        System.out.println(str);
        return sc.nextLine();
    }

    private static String getBinaryString(char ch) {
        return String.format("%7s", Integer.toBinaryString(ch)).replace(' ', '0');
    }

    private static void appendRun(StringBuilder cipher, char bit, int count) {
        if (count > 0) {
            if (!cipher.isEmpty()) cipher.append(" ");
            String prefix = (bit == '1') ? "0 " : "00 ";
            cipher.append(prefix).append("0".repeat(count));
        }
    }
}
package com.unusualbread.app.theory.M01_basics.S06_strings.L03_stringbuilder;

/*
Here you need to prepare a StringBuilder that produces all English letters in
uppercase (A-Z). All the letters should be separated by one space, but there
shouldn't be a space after the last letter.
*/

class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder sb = new StringBuilder(52);

        for (char c = 'A'; c <= 'Z'; c++) {
            sb.append(c);

            if (c != 'Z') {
                sb.append(' ');
            }
        }

        return sb;
    }
}

package org.example.recursion.Day1;
    public class ValidPalindrome {

        public void isValid(String s) {
            s = s.replaceAll(
                    "[^a-zA-Z0-9]", "").toLowerCase();
            if(helper(s, 0, s.length() - 1)){
                System.out.println(Boolean.TRUE);
            }else{
                System.out.println(Boolean.FALSE);
            }

        }

        public Boolean helper(String s, int start, int end) {
            if (start >= end) {
                return Boolean.TRUE;
            }
            if (Character.valueOf(s.charAt(start)) != Character.valueOf(s.charAt(end))) {
                return Boolean.FALSE;
            }
            return helper(s, start + 1, end - 1);
        }
    }

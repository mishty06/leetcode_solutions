class Solution {
    public int romanToInt(String s) {
        int value = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int currentValue = 0;

            switch (ch) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
            }

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                value -= currentValue;
            } else {
                value += currentValue;
            }
            prevValue = currentValue;
        }

        return value;
    }
}

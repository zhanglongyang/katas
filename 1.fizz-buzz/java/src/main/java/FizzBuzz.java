class FizzBuzz {
    public static String getResult(Integer num) {
        String result = "";

        if (num % 3 == 0) {
            result = "fizz";
        }

        if (num % 5 == 0) {
            result += "buzz";
        }

        if (result.isEmpty()) {
            result = num.toString();
        }

        return result;
    }
}

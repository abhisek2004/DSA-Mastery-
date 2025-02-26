class remove {
    public static void main(String[] args) {
        String input = "AABAAB";
        StringBuilder modified = new StringBuilder();

        modified.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (!(input.charAt(i) == 'A' && input.charAt(i - 1) == 'A')
                    && !(input.charAt(i) == 'B' && input.charAt(i - 1) == 'B')) {
                modified.append(input.charAt(i));
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Modified: " + modified.toString());
    }
}
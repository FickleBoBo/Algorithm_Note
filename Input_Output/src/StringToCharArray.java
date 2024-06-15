public class StringToCharArray {

    static String input = "A9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0yA9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0yA9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0yA9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0yA9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0yA9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0yA9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0yA9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0yA9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0yA9kG4T2pQ6v3dZFxY7rNsVbLmX8j1hBqP0u5lWgMtCey2RnD9s3UHwzKoJvQ8cF5xL1iRm9TgW6zQ4uN0y";

    public static void main(String[] args) {
        int row = 500000;
        char[][] arr1 = new char[row][input.length()];
        char[][] arr2 = new char[row][input.length()];
        long start;
        long end;

        System.out.println("toCharArray 방식");
        start = System.currentTimeMillis();
        for(int i=0 ; i<row ; i++){
            arr1[i] = input.toCharArray();
        }
        end = System.currentTimeMillis();
        System.out.printf("%d(ms)\n", (end - start));

        System.out.println("charAt 방식");
        start = System.currentTimeMillis();
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<input.length() ; j++){
                arr2[i][j] = input.charAt(j);
            }
        }
        end = System.currentTimeMillis();
        System.out.printf("%d(ms)\n", (end - start));
    }
}

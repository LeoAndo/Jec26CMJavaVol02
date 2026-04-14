public class Test0207 {
    public static void main(String[] args) {
        System.out.println(123.4);
        System.out.println(123.4F);
        System.out.println(123.4d);
        System.out.println(123.4L); // コンパイルエラー Lがつくとlong型は整数リテラルになるので.
    }
}

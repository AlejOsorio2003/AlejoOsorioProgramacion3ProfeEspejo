package LombockYDTO.TP2Lombok;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = Usuario.builder().id(123).nombre("Pepe").email("pepe@xd.com").build();
        Usuario user2 = Usuario.builder().id(321).nombre("Sech").email("elsech@xd.com").build();

        System.out.println(user1);
        System.out.println(user2);
    }
}

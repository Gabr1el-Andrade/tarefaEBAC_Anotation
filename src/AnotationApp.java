import java.lang.reflect.Method;

public class AnotationApp {
    public static void main (String[] args) {
        ClasseTab classeTab = new ClasseTab();
        System.out.println("*** Lendo anotação ***");
        Method[] methods = classeTab.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(TabelaTeste.class)) {
                TabelaTeste tabelaTeste = method.getAnnotation(TabelaTeste.class);
                String valor = tabelaTeste.valor();
                int num = tabelaTeste.num();

                System.out.println("Método: " + method.getName());
                System.out.println("Valor: " + valor);
                System.out.println("Número: " + num);
            }
        }
    }
}



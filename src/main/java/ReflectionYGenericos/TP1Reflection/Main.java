package ReflectionYGenericos.TP1Reflection;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Persona.class;

            for (Constructor<?> c : clazz.getDeclaredConstructors()) {
                System.out.println("Constructor: " + c);
            }

            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object persona = constructor.newInstance("Pablo", 30);

            Field nombreField = clazz.getDeclaredField("nombre");
            nombreField.setAccessible(true);
            nombreField.set(persona, "Juan");

            Method mostrarInfo = clazz.getMethod("mostrarInfo");
            mostrarInfo.invoke(persona);

            Method saludar = clazz.getDeclaredMethod("saludar");
            saludar.setAccessible(true);
            saludar.invoke(persona);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
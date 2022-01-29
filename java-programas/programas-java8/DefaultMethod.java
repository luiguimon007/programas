public class DefaultMethod  implements PersonaA,PersonaB{
    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar(); 
        //app.caminar(); 
    }
    @Override
    public void caminar() {
        // TODO Auto-generated method stub
        System.out.println("Hola coders");
    }
    @Override
    public void hablar() {
        // TODO Auto-generated method stub
        PersonaA.super.hablar();
    }
}

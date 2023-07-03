public class SimpleFinder extends AbstractFinder{
     public SimpleFinder (int[] elements){
         super(elements);

     }


    @Override
    public boolean find(int element) {
        System.out.println("Ищем простым перебором");
        for (int i = 0; i < elements.length; i++) {
            if (element == elements[i]) {
                return true;
            }

        }

        return false;
    }
}

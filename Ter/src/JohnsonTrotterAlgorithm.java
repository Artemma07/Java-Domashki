import java.util.Arrays;

public class JohnsonTrotterAlgorithm{
        public static void main(String[] args) {
                permutationGenerator(3);
        }

        public static int findMaxMobileElement(int[] permutation, int[] direction){// метод поиска наибольшего мобильного элемента
                int index = -1;
                for (int i =0; i<permutation.length; i++){
                        int nextIndex = i+ direction[i];
                        if (nextIndex >=0 && nextIndex < permutation.length){
                                if (permutation[i] > permutation[nextIndex]){
                                        if (index == -1){
                                                index =i;
                                        } else{
                                                if (permutation[i] > permutation[index]){
                                                        index = i;
                                                }
                                        }
                                }
                        }
                }
                return index;
        }

        public static void changeDirection (int[] permutation, int [] direction, int mobileElement) {// метод смены направления
                for (int i =0; i< permutation.length; i++){
                        if (permutation[i] > mobileElement){//если элемент больше, меняем направление,
                                direction[i] = direction[i]*(-1);
                        }
                }

        }
        public static void swap(int [] permutation, int[] direction, int i, int j){ //метод свапа для массива перестановок и массива направлений
                int permutationTemp = permutation[i];
                permutation[i] = permutation[j];
                permutation[j] = permutationTemp;

                int directionTemp = direction[i];
                direction[i] = direction[j];
                direction[j] = directionTemp;
        }
        public static void permutationGenerator(int n){
                int[] permutation = new int[n];
                int[] direction = new int [n];
                for (int i =0; i < permutation.length; i++){
                        permutation [i] = i+1;
                        direction[i] = -1;
                }
                System.out.println(Arrays.toString(permutation));
                int mobileElementIndex = findMaxMobileElement(permutation, direction); //определяем индекс макс мобильного элемета
                for (;mobileElementIndex !=-1;){
                        int mobileElement = permutation[mobileElementIndex]; //определяем макс мобильный элемент
                        int nextIndex = mobileElementIndex + direction[mobileElementIndex];// определяем индекс на который он указывает
                        swap(permutation, direction, mobileElementIndex, nextIndex); //  меняем их местами
                        changeDirection(permutation, direction, mobileElement); // меняем направление
                        System.out.println(Arrays.toString(permutation));
                        mobileElementIndex = findMaxMobileElement(permutation, direction); // повторяем поиск
                }
        }
}



public class MyList{
    private String[] arr;
    private int size;

    public MyList() {
        this.arr = new String[10];
        this.size = 0;
    }

    //add
    public boolean add(String str) {
        if (size < arr.length) {
            arr[size] = str;
            size++;
        }
        else {
            changeSize();
            arr[size] = str;
            size++; 
        }
        return true;
    }

    // public boolean add(int index, String str) {
    //     if (index < arr.length) {
    //         String temp = arr[index];
    //         arr[index] = str;
    //         for (int i = index+1; i < arr.length; i++) {
    //             String temp2 = arr[i];
    //             arr[i] = temp;
    //             temp = temp2;
    //         }
    //     }
    //     else {
    //         changeSize();
    //         String temp = arr[index];
    //         arr[index] = str;
    //         for (int i = index+1; i < arr.length; i++) {
    //             String temp2 = arr[i];
    //             arr[i] = temp;
    //             temp = temp2;
    //         }
    //     }
    //     return true;
    // }

    public boolean add(int index, String str) {
        if (index >= arr.length) {
            changeSize();
        }

        for (int i = size; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = str;
        size++;
        return true;
    }
    //get
    public String get(int index) {
        //what do i do if it is out of bounds
        if (index >= size) {
            changeSize();
            return "";
        }
        return arr[index];
    }

    //set
    public String set(int index, String str) {
        if (index >= size) {
            changeSize();
        }
        String temp = arr[index];
        arr[index] = str;
        return temp;
    }

    //remove
    public String remove(int index){
        String toRet = arr[index];
        for (int i = index; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[size-1] = null;
        size--;
        return toRet;
    }

    //indexOf CHANGE THIS
    public int indexOf(String str) {
        for (int i = 0; i < arr.length; i++) {
        if (arr[i].equals(str)) {
            return i;
        }
    }
        return -1;
    }

    //size
    public int size() {
        return size;
    }
    //changeSize
    public void changeSize(){
        String[] newArr = new String[size+5];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
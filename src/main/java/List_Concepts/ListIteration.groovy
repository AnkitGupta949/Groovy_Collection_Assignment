package List_Concepts

class ListIteration {

    public static void main(String[] args) {
        List<Integer> list=[1,4,3,7,8]
        def getEven = {num -> return(num % 2 == 0)}
        def even=list.findAll{num->num>5}
        println(even)
    }
}

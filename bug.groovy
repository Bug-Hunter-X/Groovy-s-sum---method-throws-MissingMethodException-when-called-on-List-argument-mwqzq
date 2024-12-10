def list = [1, 2, 3, 4, 5]

println list.sum() // This works fine

def myMethod(list) {
    println list.sum()
}

myMethod([1,2,3,4,5]) //This throws MissingMethodException
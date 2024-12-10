def list = [1, 2, 3, 4, 5]

println list.sum() // This works fine

def myMethod(list) {
    println list.sum() // Throws MissingMethodException
}

myMethod([1,2,3,4,5])

def myMethodFixed(java.util.List list) { //Fixed
    println list.sum()
}

myMethodFixed([1,2,3,4,5]) //This works now
fun main() {
    usersIdentity("Jane",24,"kenya")
    println(calculateSum(10,20,30,40))
    println(calculateAverage(10,20,30,40,50))

    var fullName:String ="Jane"
    println(fullName)

    var age:Int =20
    println(age)

    var phoneNumber:String ="97620301"
    println(phoneNumber)

    var email:String ="rina@gmail.com"
    println(email)

    var weight:Double =50.0
    println(weight)

    var Ugandan= false or true
    println(Ugandan)

}
//Create and invoke a function that takes in a users name, age, and nationality and prints out
//“Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and
//I am from Kenya”
fun usersIdentity(name:String,age:Int,nationality:String){
    println("Hello, my name is $name,I am $age years old and I am from $nationality")
}
//
//. Create and invoke a function that returns the sum of any given 4 numbers
fun calculateSum(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var addSums = num1+num2+num3+num4
    return addSums
}
//Create and invoke a function that given any 5 numbers, it returns their average
fun calculateAverage(nums:Int,nums1:Int,nums2:Int,nums3:Int,nums4:Int):Int{
    var getAverage = (nums+nums1+nums2+nums3+nums4)/2
    return getAverage
}

//You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not

# Guard

## What is it?
Guard adds a functionality similar to the Swift guard statement to Kotlin. 
The guard function is designed to transfer program control out of scope if the receiver is null. 

## Useage
```kotlin
var value: String? = "we might have a value"

// In it's simplest form,
// value is non-null so program control continues
val unwrappedValue = value.guard {
   println("This is never called.")
   return
}

// To add more preconditions, use Kotlin standard functions such as takeIf
val unwrappedValueWithPrecondition = value
                                    .takeIf { it.length < 100 }
                                    .guard {
                                       println("Precondition was not met.")
                                       println("This is never called.")
                                       return
                                    }
                                    
value = null
val valueThatIsNeverStored = value.guard {
   println("value was found to be null. transfering program control.")
   return
}

println("This is never reached.")

// 
```

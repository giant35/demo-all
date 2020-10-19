package demo.rest2

@RestController
open class TestController{
    @GetMapping("/test")
    fun test(@RequestBody str : String) : String{
        println("str : ${str}")
    }
}
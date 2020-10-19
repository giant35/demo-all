package demo


object App : tornadofx.App(MainView::class,Styles::class) {
    @JvmStatic
    fun main(argv: Array<String>) {
        print("hello")
    }
}

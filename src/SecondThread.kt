class SecondThread : Thread() {
    override fun run() {
        for (i in 0..10){
            println("Second Thread $i")
            sleep(1000)
        }
        println("Second Thread finished")
    }
}
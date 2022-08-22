class FirstThread : Thread() {
    override fun run() {
        for (i in 0..20) {
            println("First Thread running $i")
            sleep(2000)
        }
        println("First Thread finished")
    }
}
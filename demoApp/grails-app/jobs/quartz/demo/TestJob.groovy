package quartz.demo

class TestJob {

    static concurrent = false

    static triggers = {
      simple repeatInterval: 1000l // execute job once in 5 seconds
    }

    def execute() {
        println "sleeping... ${Thread.currentThread().name}"
        Thread.sleep(5301)
        println "executing .... "
        // execute job
        println "done ${Thread.currentThread().name}"
    }
}

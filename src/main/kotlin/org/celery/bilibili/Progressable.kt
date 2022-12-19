class Progressable(
    val operationSize: Int,
    val subOperationSize: Int,
    val function: suspend (progress: ProgressValue) -> Any,
) {

    class ProgressValue(var main: Int, var sub: Int, val mainMax: Int, val subMax: Int) {
        class InnerLogger {
            var message = "init"
            var type = ""
            fun progressing(message: String) = synchronized(this) {
                this.message = message
                type = "progressing"
            }

            fun debug(message: String) = synchronized(this) {
                TODO()
                this.message = message
            }

            fun warning(message: String) = synchronized(this) {
                TODO()
                this.message = message
            }

            fun error(message: String) = synchronized(this) {
                TODO()
                this.message = message
            }

            fun info(message: String) = synchronized(this) {
                TODO()
                this.message = message
            }
        }

        val logger = InnerLogger()
        val step = 2
        private val processChar = "█"
        private val waitChar = "─"
        fun increaseMainAndGet(): Int {
            synchronized(this) {
                main++
                sub = 0
                printProgressBar()
                return main
            }
        }

        fun increaseMain(len: Int) {
            synchronized(this) {
                main += len
                sub = 0
                printProgressBar()
//            return main
            }
        }

        fun increaseSubAndGet(): Int {
            synchronized(this) {
                sub++
                if (sub == subMax) {
                    increaseMainAndGet()
                    return 0
                }
                printProgressBar()
                return sub
            }
        }

        private fun printProgressBar() {
            //length = 50
            print(
                "├%s%s┤%6.2f%% %s\r".format(
                    processChar.repeat((main.toFloat() / mainMax).times(80).toInt()),
                    waitChar.repeat(80-(main.toFloat() / mainMax).times(80).toInt()),
                    100.0 * (main * subMax + sub) / (mainMax * subMax),
                    logger.message
                )
            )
        }

        fun get(): Int {
            synchronized(this) {
                return main
            }
        }

        fun flush() {
            printProgressBar()
        }

    }

    suspend fun start(): Progressable {
        val progressValue = ProgressValue(0, 0, operationSize, subOperationSize)
        function(progressValue)
        with(progressValue) {
            if (main * subMax + sub != mainMax * subMax) {
                println()
                throw IllegalStateException("progress not done")
            }
        }
        println()
        return this
    }
}
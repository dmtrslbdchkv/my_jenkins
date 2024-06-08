def os = System.getProperty('os.name').toLowerCase()
if (os.contains('win')) {
    println "Running on Windows"
    def process = "wmic logicaldisk get size,freespace,caption".execute()
    process.in.eachLine { line -> println line }
} else {
    println "Running on Unix-like OS"
    def process = "df -h".execute()
    process.in.eachLine { line -> println line }
}
process.waitFor()

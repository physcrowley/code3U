void main() {
    var currentDir = new File(".");
    var filesList = new ArrayList<File>();
    for (File f : currentDir.listFiles()) {
        if (f.getName().endsWith(".md")) {
            filesList.add(f);
        }
    }
    IO.println(filesList);
}

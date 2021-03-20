package HomeWork6.task;

import HomeWork6.text.api.ISearchEngine;

public class Task implements Runnable{
    private final ReadBook book;
    private final String searchWord;
    private final LogFile logFile;
    private final ISearchEngine searchEngine;

    public Task(ReadBook book,String searchWord, LogFile logFile,ISearchEngine searchEngine) {
        this.book = book;
        this.searchWord = searchWord;
        this.logFile = logFile;
        this.searchEngine = searchEngine;

    }

    @Override
    public void run() {
        long count = searchEngine.search(book.getTextBook(),searchWord);
        logFile.add(book.getNameBook() + " - " + searchWord + " - " + count);
    }
}

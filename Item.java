package serverside;
/*
 * EE422C Final Project submission by
 * Replace <...> with your actual data.
 * <Siddharth Benoy>
 * <sb62297>
 * <17195>
 * Spring 2023
 */


import java.util.List;

public class Item {
    private List<Item> items;
    private String itemType;
    private String title;
    private String author;
    private String storage;
    private String summaryDescription;
    private String userCurrentlyCheckedOut;
    private List<String> membersListPrior;
    private String checkedOutLast;
    private String image;

    public Item(){

    }
    public Item(String itemType, String title, String author, String pages, String summaryDescription, String userCurrentlyCheckedOut, List<String> membersListPrior, String checkedOutLast, String image) {
        this.itemType = itemType;
        this.title = title;
        this.author = author;
        this.storage = pages;
        this.summaryDescription = summaryDescription;
        this.userCurrentlyCheckedOut = userCurrentlyCheckedOut;
        this.membersListPrior = membersListPrior;
        this.checkedOutLast = checkedOutLast;
        this.image = image;
    }
    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getStorage() {
        return storage;
    }
    public void setStorage(String storage) {this.storage = storage;
    }
    public String getSummaryDescription() {
        return summaryDescription;
    }
    public void setSummaryDescription(String summaryDescription) {
        this.summaryDescription = summaryDescription;
    }
    public String getUserCurrentlyCheckedOut() {
        return userCurrentlyCheckedOut;
    }
    public void setUserCurrentlyCheckedOut(String userCurrentlyCheckedOut) {
        this.userCurrentlyCheckedOut = userCurrentlyCheckedOut;
    }
    public List<String> getMembersListPrior() {
        return membersListPrior;
    }
    public void setMembersListPrior(List<String> membersListPrior) {
        this.membersListPrior = membersListPrior;
    }
    public String getCheckedOutLast() {
        return checkedOutLast;
    }
    public void setCheckedOutLast(String checkedOutLast) {
        this.checkedOutLast = checkedOutLast;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {this.image = image;
    }
}

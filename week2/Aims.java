public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();

        DigitalVideoDics dvd1 = new DigitalVideoDics("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDics dvd2 = new DigitalVideoDics("The Lion King");
        dvd2.setCategory("Animation");
        dvd2.setCost(19.95f);
        dvd2.setDirector("Roger Allers");
        dvd2.setLength(87);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDics dvd3 = new DigitalVideoDics("The Lion King");
        dvd3.setCategory("Animation");
        dvd3.setCost(19.95f);
        dvd3.setDirector("Roger Allers");
        dvd3.setLength(87);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDics dvd4 = new DigitalVideoDics("The Lion King");
        dvd4.setCategory("Animation");
        dvd4.setCost(19.95f);
        dvd4.setDirector("Roger Allers");
        dvd4.setLength(87);
        anOrder.addDigitalVideoDisc(dvd4);

        DigitalVideoDics dvd5 = new DigitalVideoDics("The Lion King");
        dvd5.setCategory("Animation");
        dvd5.setCost(19.95f);
        dvd5.setDirector("Roger Allers");
        dvd5.setLength(87);
        anOrder.addDigitalVideoDisc(dvd5);

        DigitalVideoDics dvd6 = new DigitalVideoDics("The Lion King");
        dvd6.setCategory("Animation");
        dvd6.setCost(19.95f);
        dvd6.setDirector("Roger Allers");
        dvd6.setLength(87);
        anOrder.addDigitalVideoDisc(dvd6);

        DigitalVideoDics dvd7 = new DigitalVideoDics("The Lion King");
        dvd7.setCategory("Animation");
        dvd7.setCost(19.95f);
        dvd7.setDirector("Roger Allers");
        dvd7.setLength(87);
        anOrder.addDigitalVideoDisc(dvd7);

        DigitalVideoDics dvd8 = new DigitalVideoDics("The Lion King");
        dvd8.setCategory("Animation");
        dvd8.setCost(19.95f);
        dvd8.setDirector("Roger Allers");
        dvd8.setLength(87);
        anOrder.addDigitalVideoDisc(dvd8);

        DigitalVideoDics dvd9 = new DigitalVideoDics("The Lion King");
        dvd9.setCategory("Animation");
        dvd9.setCost(19.95f);
        dvd9.setDirector("Roger Allers");
        dvd9.setLength(87);
        anOrder.addDigitalVideoDisc(dvd9);

        DigitalVideoDics dvd10 = new DigitalVideoDics("The Lion King");
        dvd10.setCategory("Animation");
        dvd10.setCost(19.95f);
        dvd10.setDirector("Roger Allers");
        dvd10.setLength(87);
        anOrder.addDigitalVideoDisc(dvd10);

        DigitalVideoDics dvd11 = new DigitalVideoDics("The Lion King");
        dvd11.setCategory("Animation");
        dvd11.setCost(19.95f);
        dvd11.setDirector("Roger Allers");
        dvd11.setLength(87);
        anOrder.addDigitalVideoDisc(dvd11);

        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd10);
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd9);
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        (new MyDate()).print();
        (new MyDate()).accept();

    }
}
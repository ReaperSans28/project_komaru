 class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var heavyDog = dog + 4;
        var heavyCat = cat + 4;
        var heavyPaper = paper + 4;
        System.out.println(heavyDog);
        System.out.println(heavyCat);
        System.out.println(heavyPaper);

        var otherDog = heavyDog - 3.5;
        var otherCat = heavyCat - 1.6;
        var otherPaper = heavyPaper - 7639;
        System.out.println(otherDog);
        System.out.println(otherCat);
        System.out.println(otherPaper);

        var friend = 19;
        System.out.println(friend);
        var biggerFriend = friend + 2;
        System.out.println(biggerFriend);
        var smallerFriend = biggerFriend / 7;
        System.out.println(smallerFriend);

        var frog = 3.5;
        System.out.println(frog);
        var biggerFrog = frog * 10;
        System.out.println(biggerFrog);
        var smallestFrog = biggerFrog / 3.5;
        System.out.println(smallestFrog);
        var smallFrog = smallestFrog + 4;
        System.out.println(smallFrog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalMass = firstBoxer + secondBoxer;
        System.out.println(totalMass);
        var differenceMass = secondBoxer - firstBoxer;
        System.out.println(differenceMass);

        var residue = secondBoxer % firstBoxer;
        System.out.println(residue);

        var totalTime = 640;
        var firstTimeWork = 8;
        var totalEmployers = totalTime / firstTimeWork;
        System.out.println("Всего работников в компании - " + totalEmployers + " человек");

        var newTotalEmployers = totalEmployers + 94;
        var newTotalWork = newTotalEmployers * firstTimeWork;
        System.out.println("Если в компании работает " + newTotalEmployers + " человек, то всего " + newTotalWork + " часов работы может быть поделено между сотрудниками");
    }
}
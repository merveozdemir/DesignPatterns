package iteratorDesignPattern.test;

import iteratorDesignPattern.collections.LinkedList;
import iteratorDesignPattern.collections.LinkedListCollection;
import iteratorDesignPattern.domain.Personel;
import iteratorDesignPattern.iterators.BaseIterator;

import java.util.ArrayList;

/**
 * IteratorTest
 *
 * @author Merve ÖZDEMİR
 * @since 14/06/2020
 */
public class IteratorTest {
    public static void main(String[] args) {

        Object[] personelArray = getPersonelArray();
        ArrayList<Object> personelArrayList = getPersonelArrayList();
        LinkedList personelLinkedList = getPersonelLinkedList();

//        ArrayCollection arrayCollection = new ArrayCollection(personelArray);
//        BaseIterator iterator = arrayCollection.getIterator();

//       ArrayListCollection arrayListCollection = new ArrayListCollection(personelArrayList);
//        BaseIterator iterator = arrayListCollection.getIterator();

        LinkedListCollection linkedListCollection = new LinkedListCollection(personelLinkedList);
        BaseIterator iterator = linkedListCollection.getIterator();

        Long toplamMaas = 0L;
        while(iterator.hasNext()){
            Personel currentPersonel = (Personel) iterator.next();
            toplamMaas += currentPersonel.getMaas();
            System.out.println(currentPersonel.getAdi()+" "+currentPersonel.getSoyadi()+" | "+currentPersonel.getMaas());
        }

        System.out.println("Toplam Maaş: " + toplamMaas);


    }

    private static Object [] getPersonelArray() {
        Personel p1 = new Personel();
        p1.setAdi("Merve");
        p1.setSoyadi("Özdemir");
        p1.setMaas(15000L);

        Personel p2 = new Personel();
        p2.setAdi("Kaan");
        p2.setSoyadi("Binat");
        p2.setMaas(15000L);

        Personel p3 = new Personel();
        p3.setAdi("Kübra");
        p3.setSoyadi("Durus");
        p3.setMaas(20000L);

        Personel p4 = new Personel();
        p4.setAdi("Gökçe");
        p4.setSoyadi("Doğanay");
        p4.setMaas(20000L);

        Object [] personelArray = new Object[4];
        personelArray[0] = p1;
        personelArray[1] = p2;
        personelArray[2] = p3;
        personelArray[3] = p4;

        return personelArray;
    }

    private static ArrayList<Object> getPersonelArrayList(){
        Personel p1 = new Personel();
        p1.setAdi("Merve");
        p1.setSoyadi("Özdemir");
        p1.setMaas(15000L);

        Personel p2 = new Personel();
        p2.setAdi("Kaan");
        p2.setSoyadi("Binat");
        p2.setMaas(15000L);

        Personel p3 = new Personel();
        p3.setAdi("Kübra");
        p3.setSoyadi("Durus");
        p3.setMaas(20000L);

        Personel p4 = new Personel();
        p4.setAdi("Gökçe");
        p4.setSoyadi("Doğanay");
        p4.setMaas(20000L);

        ArrayList<Object> personelList = new ArrayList<Object>();
        personelList.add(p1);
        personelList.add(p2);
        personelList.add(p3);
        personelList.add(p4);

        return personelList;
    }

    private static LinkedList getPersonelLinkedList(){
        Personel p1 = new Personel();
        p1.setAdi("Merve");
        p1.setSoyadi("Özdemir");
        p1.setMaas(15000L);

        Personel p2 = new Personel();
        p2.setAdi("Kaan");
        p2.setSoyadi("Binat");
        p2.setMaas(15000L);

        Personel p3 = new Personel();
        p3.setAdi("Kübra");
        p3.setSoyadi("Durus");
        p3.setMaas(20000L);

        Personel p4 = new Personel();
        p4.setAdi("Gökçe");
        p4.setSoyadi("Doğanay");
        p4.setMaas(20000L);

        LinkedList linkedList = new LinkedList();
        linkedList.addLast(p1);
        linkedList.addLast(p2);
        linkedList.addLast(p3);
        linkedList.addLast(p4);

        return linkedList;
    }
}

package VL07_JavaBean_PropertiesBindings_Observer_JavaFX.PropertiesLists;

import java.util.List;

import VL05_JAVAIO_Streams_Exceptions.A29.Angestellter;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class Main {
	public static void main(String[] args) {
		
		ObservableList<String> list = FXCollections.observableArrayList();
		
		/*
		list.addListener(new ListChangeListener() {
			@Override
			public void onChanged(Change c) {
				System.out.println(c.toString());
			}
		});
		*/
		
		list.addListener(new ListChangeListener<String>() {
			@Override
			public void onChanged(ListChangeListener.Change<? extends String> c) {
				while(c.next()) {
					if(c.wasAdded()) {
						List<? extends String> sublist = c.getAddedSubList();
						for(String a: sublist) {
							System.out.printf("%s wurde neu eingetragen%n",a);
						}
					}
				}
			}
		});
		
		
		
		list.add("Hallo");
		list.add("Bye");
		
		/*  { [Hallo] added at 0 }
			{ [Bye] added at 1 }
		*/
		
		//Beispiel mit Angestellter (Typisierte Liste)
		ObservableList<Angestellter> angestellte = FXCollections.observableArrayList();
		
		angestellte.addListener(new ListChangeListener<Angestellter>() {
			@Override
			public void onChanged(ListChangeListener.Change<? extends Angestellter> c) {
				while(c.next()) {
					if(c.wasAdded()) {
						List<? extends Angestellter> sublist = c.getAddedSubList();
						for(Angestellter a: sublist) {
							System.out.printf("%s wurde neu eingetragen%n",a.getName());
						}
					}
				}
			}
		});
		
		angestellte.addAll(new Angestellter(0,"John","Dortmund",1000), new Angestellter(1,"Lin","Bochum",3000));
		
		angestellte.add(new Angestellter(2,"Dan","Essen",2000));
	}
}

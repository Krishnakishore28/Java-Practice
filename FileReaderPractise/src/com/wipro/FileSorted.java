package com.wipro;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FileSorted {
	public static void main(String args[]) throws IOException {
		String input=args[0];
		String output=args[1];
		File f=new File(input);
		FileReader fr=new FileReader(f);
		int c;
		String temp="";
		Map<String,Integer> map=new TreeMap<String,Integer>();
		while((c=fr.read())!=-1) {
			if(c==32 || c==13 || c==10) {
				map.put(temp,map.containsKey(temp) ? map.get(temp)+1 : 1);
				//System.out.println(map);
				temp="";
			}
			else {
				temp+=(char)c;
			}
		}
		map.put(temp,map.containsKey(temp) ? map.get(temp)+1 : 1);
		//System.out.println(map);
		/*for(Map.Entry<String,Integer> maps:map.entrySet()) {
			if(!maps.getKey().isEmpty()) {
				System.out.println(maps.getKey()+" : "+maps.getValue());
			}
		}*/
		//System.out.println(map.keySet());
		FileWriter fw=new FileWriter(output);
		
		for(Map.Entry<String,Integer> maps:map.entrySet()) {
				//System.out.println(maps.getKey());
				if(!maps.getKey().isEmpty()) {
					fw.write(maps.getKey()+" : "+maps.getValue());
					fw.write(System.getProperty("line.separator"));
				}
			
		}
		fw.close();
		fr.close();
	}

}

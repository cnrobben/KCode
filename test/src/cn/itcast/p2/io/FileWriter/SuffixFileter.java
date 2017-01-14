package cn.itcast.p2.io.FileWriter;

import java.io.File;
import java.io.FilenameFilter;

public class SuffixFileter implements FilenameFilter {

	private String suffix ;
	public SuffixFileter(String name) {
		 this.suffix = name;
		
	}

	public boolean accept(File dir, String name) {
		return name.endsWith(suffix);
	}

}

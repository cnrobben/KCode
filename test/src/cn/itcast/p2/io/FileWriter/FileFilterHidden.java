package cn.itcast.p2.io.FileWriter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterHidden implements FileFilter {

	
	public boolean accept(File pathname) {
		return !pathname.isHidden();
	}

}

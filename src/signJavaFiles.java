import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;

public class signJavaFiles {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws IOException {
			final String myCopyright = "//Copyright Grrrrraaaaaaaahaaaaaam, 2020";
			final String folderStr = new java.io.File("src").getCanonicalPath();
			File folder = new File(folderStr);
			final File[] listOfFiles = folder.listFiles();
			Stream<Path> walk = Files.walk(Paths.get(folderStr));
			
			
			List<String> result = walk.map(x -> x.toString())
				.filter(f -> f.endsWith(".java")).collect(Collectors.toList());
				for (String path : result) {
					File files = new File(path);
					if (FileUtils.readFileToString(files).contains(myCopyright)) {
					} else {FileUtils.write(files, "\n" + myCopyright, true);
							System.out.println(files.getPath() + " has been signed!");}
		
		}

	}

}

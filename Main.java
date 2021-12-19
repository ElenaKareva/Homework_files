import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder();

        //создание Директории src в Games
        File folderSrc = new File("C:\\Games1\\src");
        if (folderSrc.mkdir()) {
            sb.append("Директория ")
                    .append(folderSrc.getName())
                    .append(" в 'Games' успешно создана")
                    .append("\n");
        } else {
            sb.append("Не удалось создать Директорию ")
                    .append(folderSrc.getName())
                    .append("\n");
        }
        //создание Директории res в Games
        File folderRes = new File("C:\\Games1\\res");
        if (folderRes.mkdir()) {
            sb.append("Директория ")
                    .append(folderRes.getName())
                    .append(" в 'Games' успешно создана")
                    .append("\n");
        } else {
            sb.append("Не удалось создать Директорию ")
                    .append(folderRes.getName())
                    .append("\n");
        }
        //создание Директории saveGames в Games
        File folderSaveGames = new File("C:\\Games1\\saveGames");
        if (folderSaveGames.mkdir()) {
            sb.append("Директория ")
                    .append(folderSaveGames.getName())
                    .append(" в 'Games' успешно создана")
                    .append("\n");
        } else {
            sb.append("Не удалось создать Директорию ")
                    .append(folderSaveGames.getName())
                    .append("\n");
        }
        //создание Директории temp в Games
        File folderTemp = new File("C:\\Games1\\temp");
        if (folderTemp.mkdir()) {
            sb.append("Директория ")
                    .append(folderTemp.getName())
                    .append(" в 'Games' успешно создана")
                    .append("\n");
        } else {
            sb.append("Не удалось создать Директорию ")
                    .append(folderTemp.getName())
                    .append("\n");
        }
        //создание папки main в src
        File folderMain = new File("C:\\Games1\\src\\main");
        if (folderMain.mkdir()) {
            sb.append("Директория ")
                    .append(folderMain.getName())
                    .append(" в ").append(folderSrc.getName()).append(" успешно создана")
                    .append("\n");
        } else {
            sb.append("Не удалось создать Директорию ")
                    .append(folderMain.getName())
                    .append("\n");
        }
        //создание папки test в src
        File folderTest = new File("C:\\Games1\\src\\test");
        if (folderTest.mkdir()) {
            sb.append("Директория ")
                    .append(folderTest.getName())
                    .append(" в ").append(folderSrc.getName()).append(" успешно создана")
                    .append("\n");
        } else {
            sb.append("Не удалось создать Директорию ")
                    .append(folderTest.getName())
                    .append("\n");
        }
        //создание файла Main.java в директории main
        File fileMain = new File("C:\\Games1\\src\\main\\Main.java");
        try {
            if (fileMain.createNewFile()) {
                sb.append("Файл ")
                        .append(fileMain.getName())
                        .append(" в ").append(folderMain.getName()).append(" успешно создан")
                        .append("\n");
            } else {
                sb.append("Не удалось создать файл ")
                        .append(fileMain.getName())
                        .append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //создание файла Utils.java в директории main
        File fileUtils = new File("C:\\Games1\\src\\main\\Utils.java");
        try {
            if (fileUtils.createNewFile()) {
                sb.append("Файл ")
                        .append(fileUtils.getName())
                        .append(" в ").append(folderMain.getName()).append(" успешно создан")
                        .append("\n");
            } else {
                sb.append("Не удалось создать файл ")
                        .append(fileUtils.getName())
                        .append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        //создание папки drawables в res
        File folderDrawables = new File("C:\\Games1\\res\\drawables");
        if (folderDrawables.mkdir()) {
            sb.append("Директория ")
                    .append(folderDrawables.getName())
                    .append(" в ").append(folderRes.getName()).append(" успешно создана")
                    .append("\n");
        } else {
            sb.append("Не удалось создать Директорию ")
                    .append(folderDrawables.getName())
                    .append("\n");
        }
        //создание папки vectors в res
        File folderVectors = new File("C:\\Games1\\res\\vectors");
        if (folderVectors.mkdir()) {
            sb.append("Директория ")
                    .append(folderVectors.getName())
                    .append(" в ").append(folderRes.getName()).append(" успешно создана")
                    .append("\n");
        } else {
            sb.append("Не удалось создать Директорию ")
                    .append(folderVectors.getName())
                    .append("\n");
        }
        //создание файла Директории icons в res
        File folderIcons = new File("C:\\Games1\\res\\icons");
        if (folderIcons.mkdir()) {
            sb.append("Директория ")
                    .append(folderIcons.getName())
                    .append(" в ").append(folderRes.getName()).append(" успешно создана")
                    .append("\n");
        } else {
            sb.append("Не удалось создать Директорию ")
                    .append(folderIcons.getName())
                    .append("\n");
        }

        // создание файла temp в Директории temp
        File fileTemp = new File("C:\\Games1\\temp\\temp.txt");
        try {
            if (fileTemp.createNewFile()) {
                sb.append("Файл ")
                        .append(fileTemp.getName())
                        .append(" в ").append(folderTemp.getName()).append(" успешно создан")
                        .append("\n");
            } else {
                sb.append("Не удалось создать поддиректорию ")
                        .append(fileTemp.getName())
                        .append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //   запись в файл temp.txt данных о создании папок и файлов
        try (FileWriter fw = new FileWriter("C:\\Games1\\temp\\temp.txt")) {
            fw.write(sb.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sb.toString());

        //Задание 2
        GameProgress gameProgress1 = new GameProgress(100, 10, 36, 100);
        GameProgress gameProgress2 = new GameProgress(50, 5, 18, 50);
        GameProgress gameProgress3 = new GameProgress(25, 2, 9, 25);

        saveGame("C:\\Games1\\saveGames\\save1.dat", gameProgress1);
        saveGame("C:\\Games1\\saveGames\\save2.dat", gameProgress2);
        saveGame("C:\\Games1\\saveGames\\save3.dat", gameProgress3);

        List<String> paths = new ArrayList<>();
        paths.add("C:\\Games1\\saveGames\\save1.dat");
        paths.add("C:\\Games1\\saveGames\\save2.dat");
        paths.add("C:\\Games1\\saveGames\\save3.dat");

        zipFiles("C:\\Games1\\saveGames\\save.zip", paths);
        deleteUnpackingFiles();
    }

    //сохранение
    private static void saveGame(String filePath, GameProgress instance) {
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(instance);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //архивация
    private static void zipFiles(String filePath, List<String> listObjectPath) {
        try (ZipOutputStream zous = new ZipOutputStream(new FileOutputStream(filePath))) {
            int count = 1;
            for (String path : listObjectPath) {
                FileInputStream fis = new FileInputStream(path);
                ZipEntry entry = new ZipEntry("packed_save" + count++ + ".dat");
                zous.putNextEntry(entry);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                zous.write(buffer);
                zous.closeEntry();
                fis.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //удаление файлов сохранений, лежащих вне архива
    private static void deleteUnpackingFiles() {
        File files = new File("C:\\Games1\\saveGames");
        if (files.isDirectory()) {
            for (File file : files.listFiles()) {
                if (!file.getName().contains(".zip")) {
                    file.delete();
                }
            }
        }
    }
}

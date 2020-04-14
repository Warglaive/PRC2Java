package nl.fontys.sebivenlo.csvobjectstream;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Reads CSV files and turns the records into objects. Can read source from
 * local files but also from urls.
 *
 * @author Pieter van den Hombergh (p dot vandenhombergh at fontys dot nl)
 * @param <T> type of the created objects.
 */
public class CSVObjectStream<T> {

    final Path filePath;
    final String splitString = ";";

    /**
     * Construct the stream from a path.
     *
     * @param filePath the source of the csv records
     * @throws URISyntaxException when the uri is not accepted
     * @throws MalformedURLException when the URL does not match the standard.
     */
    public CSVObjectStream( Path filePath ) throws
            URISyntaxException, MalformedURLException {
        this.filePath = filePath;
    }

    /**
     * The actual stream.
     * The creator makes the objects of type T, the rowfilter makes sure that a row
     * is suitable for the creator.
     *
     * @param creator from {@code String[] -> T}
     * @param rowFilter to make it possible to reject rows, e.g. the header of
     * the csv file.
     * @return the stream of T
     * @throws IOException when the file cannot be processed.
     */
    public Stream<T> stream( Function<? super String[], ? extends T> creator,
            Predicate<? super String[]> rowFilter ) throws
            IOException {
        //TODO 2 implement CSVObjectStream.stream.
        return null;
    }

    /**
     * Collect stream to a list.
     *
     * @param creator from {@code String[] -> T}
     * @param rowFilter to make it possible to reject rows, e.g. the header of
     * the csv file.
     * @return the created objects in a list in file encounter order.
     * @throws IOException when csv file cannot be read.
     */
    public List<T> asList( Function<? super String[], ? extends T> creator,
            Predicate<? super String[]> rowFilter ) throws
            IOException {

        //TODO 4 implement asList
        return null;

    }

}

package koans.streams;

import errors.EmptyKoan;
import koans.KoanFunction;

import java.util.stream.Stream;

public class StreamAllMatch implements KoanFunction<Stream<Integer>, Boolean> {
    @Override
    public Boolean answer(Stream<Integer> integers) {
        /*
         * Given the stream, use the Stream.AllMatch function to determine if all integers in the stream are
         * greater than zero.
         *
         * The Stream.AllMatch method maps each stream element to a boolean. If ALL of the booleans are True, then
         * the AllMatch method returns true. If any stream element maps to False, then the AllMatch method returns false.
         */
        throw new EmptyKoan();
    }
}

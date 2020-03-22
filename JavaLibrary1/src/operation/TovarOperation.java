package operation;

import java.util.List;
import types.Tovar;

/**
 *
 * @author Lactea Via
 */
public interface TovarOperation {
    List<Tovar> getListOfTovar();
    List<Tovar> addNewTovar(Tovar item);
    int getSumOfTovar();
}

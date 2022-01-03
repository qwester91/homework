package Home_work4.DataContainer;
//1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например литерал T.
// Данный класс как раз и будет решать задачу поставленную перед нами: хранить неограниченное количество передаваемых
// объектов обобщённого типа.
//2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено для хранения передаваемых
// объектов. Да, именно T[] а не Object[]. Если использовать Object[] то это будет опасно и постоянно придётся делать
// приведеление типов.
//3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]).
// Есть и другие способы, но в рамках обучения они будут сложными и с ними мы разбираться будем слишком сложно.

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T>{
    private  T[] data;

    public DataContainer(T[] data){
        this.data = data;
    }

    /**
     * 4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и
     * возвращает номер позиции в которую были вставлены данные, начиная с 0.
     * 	4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней
     * 	заполненной позиции (ячейки).
     * 		4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777).
     * 		Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
     * 		4.1.2 Пример: data = [1, 2, 3, null, null, null].
     * 		Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null].
     * 		Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.
     * 		4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777).
     * 		Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
     * 	4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для новых элементов.
     * 	Тут вам поможет Arrays.copyOf.
     * 		4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777].
     * 		Метод add вернёт число 3.
     * 		4.2.2 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
     * @param item - элемент типа <Т> который хочется добавить в контейнер
     *
     * @return возврвщает индекс элемента в контейнере, или -1 если передан null.
     */
    public int add(T item){
        int newLength = data.length + 1;
        if (item == null){return -1;}
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                data[i] = item;
                return i;
            }
        }

        T[] newData = Arrays.copyOf( data, newLength);
        newData[newLength-1]= item;
        this.data = newData;
        return newLength-1;

    }

    /**
     * 5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data,
     * предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.
     * 	5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0.
     * 	Вызываем get(0). Метод get возвращает 9999
     * 	5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
     * @param index индекс элемента, который желаем получить
     * @return если такого индекса нет, возвращаем null. иначе возвращаем элемент контейнера под переданным индексом
     */
    public T get(int index) {
        if (index >= data.length || index < 0){
            return null;
        }
        return data[index];
    }


    /**
     * 6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает поле data.
     * @return поле data.
     */
    public T[] getItems(){
        return data;
    }


    /**
     * 7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
     * 	7.1 Метод возвращает true если у нас получилось удалить данные.
     * 		7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
     * 	7.2 Метод возвращает false если нет такого индекса.
     * 		7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
     * 	7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
     * 		7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true
     * @param index индекс элемента который необходимо удалить
     * @return true если элемент контейнера удален, false если элемент контейнера не был удален(индекс был передан не корректно)
     */
    public boolean delete(int index){
        if (index >= data.length || index < 0){
            return false;
        }

        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }

        this.data = Arrays.copyOf( data, data.length - 1);
        return true;
    }


    /**
     * 8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
     * 	8.1 Метод возвращает true если у нас получилось удалить данные.
     * 		8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
     * 	8.2 Метод возвращает false если нет такого элемента.
     * 		8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
     * 	8.3 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
     * 		8.3.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод delete вернёт true
     * @param item элемент который нужно удалить
     * @return true если элемент контейнера удален, false если нету такого элемента
     */
    public boolean delete(T item){
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)){
                for ( int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                this.data = Arrays.copyOf( data, data.length - 1);
                return true;
            }
        }return false;
    }

    /**
     * 9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой
     *  данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
     *  Классом Arrays пользоваться запрещено. Сортировка пузырьком честно украдена из SortsUtils из Home_work2
     * @param comparator обьект comparator, реализующий сравнение обьектов типа <T>
     */
    public void sort(Comparator <T>comparator){
        T help;
        int stop = 0;
        for (int i = 0; i < data.length-1; i++) {
            stop = 0;
            for (int j = 0; j < data.length-1-i; j++) {
                if (comparator.compare(data[j], data[j + 1]) > 0){
                    help = data[j];
                    data[j] = data[j+1];
                    data[j+1] = help;
                    stop = 1;
                }
            }
            if (stop == 0) {
                break;
            }
        }

    }

    //10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.


    @Override
    public String toString() {
        T[] newDataWithoutNull = data;

        for (int i = 0; i < newDataWithoutNull.length; i++) {
            if (newDataWithoutNull[i] == null) {
                for (int j = i; j < newDataWithoutNull.length - 1; j++) {
                    newDataWithoutNull[j] = newDataWithoutNull[j + 1];
                }
                newDataWithoutNull = Arrays.copyOf(newDataWithoutNull, newDataWithoutNull.length - 1);
                i--;
            }
        }
        return "DataContainer{" +
                "data=" + Arrays.toString(newDataWithoutNull) +
                '}';
    }



}



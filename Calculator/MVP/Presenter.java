package Calculator.MVP;

/**Класс связывает Model и View */
public class Presenter {
    View view;
    Model model;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void buttonClick() {
        model.run();
    }
}

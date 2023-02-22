from Calculator.OperationsInitializations.Mult import Mult
from Calculator.OperationsRun.Run import Run
from Calculator.MVP.View import View


class RunMult(Run):

    def run_operation(self):
        view = View()
        mult = Mult()
        x = view.get_value("Введите x: ")
        y = view.get_value("Введите y: ")
        res = mult.result(x, y)
        view.show(res, "Mult : ")

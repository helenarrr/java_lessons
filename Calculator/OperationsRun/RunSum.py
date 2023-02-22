from Calculator.OperationsRun.Run import Run
from Calculator.OperationsInitializations.Sum import Sum
from Calculator.MVP.View import View


class RunSum(Run):

    def run_operation(self):
        view = View()
        sum = Sum()
        x = view.get_value("Введите x: ")
        y = view.get_value("Введите y: ")
        res = sum.result(x, y)
        view.show(res, "Sum : ")


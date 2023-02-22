from Calculator.GoProgram.Choice import Choice
from Calculator.OperationsRun.RunDiv import RunDiv
from Calculator.OperationsRun.RunMult import RunMult
from Calculator.OperationsRun.RunSum import RunSum


class Model:

    def run(self, choice_user=Choice()):
        user_choice = choice_user.get_choice()
        run_sum = RunSum()
        run_mult = RunMult()
        run_div = RunDiv()
        match user_choice:
            case "1": run_sum.run_operation()
            case "2": run_mult.run_operation()
            case "3": run_div.run_operation()

 #BASF Cu Additive Additions

def additive_calculation(standard,bath,target):
    target = float(((target-(bath*(target/standard)))*bathvolume))
    target = '{:.1f}'.format(target)
    return target

def get_accelerator():
    accs = float(input('Enter the accelerator Standard: '))
    accb = float(input('Enter the accelerator Bath: '))
    acctarget = float(input('Enter the accelerator target: '))
    return(accs,accb,acctarget)

def get_leveler():
    levs = float(input('Enter the leveler Standard: '))
    levb = float(input('Enter the leveler Bath: '))
    levtarget = float(input('Enter the leveler target: '))
    return (levs,levb,levtarget)

def get_supressor():
    sups = float(input('Enter the supressor Standard: '))
    supb =float( input('Enter the supressor Bath: '))
    suptarget = float(input('Enter the supressor target: '))
    return (sups,supb,suptarget)

####Start
bathvolume = float(input('Enter total bath volume: '))
print('Which additive would you like to calculate?\n','Accelerator?\n','Leveler?\n','Supressor?\n')

additive = input('Enter A , L , or S: ').upper()
if additive == 'A':
    accs,accb,acctarget = get_accelerator()
    target = additive_calculation(accs,accb,acctarget)
    print('Please add ' , target , 'ml of accelerator to the bath.')
elif additive == 'L':
    levs,levb,levtarget = get_leveler()
    target = additive_calculation(levs,levb,levtarget)
    print('Please add ' , target , 'ml of leveler to the bath.')
elif additive == 'S':
    sups,supb,suptarget = get_supressor()
    target = additive_calculation(sups,supb,suptarget)
    print('Please add ' , target , 'ml of supressor to the bath.')
else:
    print('You entered an invailid input. Try again: ')

input("Press enter to exit ;)")

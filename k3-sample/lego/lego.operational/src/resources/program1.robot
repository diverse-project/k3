while not obstacle(distance=40) do
  move(power=75)
end

bip(duration=250, power=100, repeat=false)
setTurnAngle(angle=0)

while obstacle(distance=40) and not hasTurned(angle=360) do 
  turn(power=25, angle=3)
end

if hasTurned(angle=360) then
  stopEngine
  display(msg="Stuck!!!", duration=3000, line=4, col=0)
  stopProgram
end

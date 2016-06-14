
#!/bin/ruby

n = gets.strip.to_i
arr = gets.strip
arr = arr.split(' ').map(&:to_i)

positiveNs = 0.0
negativeNs = 0.0
zeroNs = 0.0
arr.each  do |a|
  if a > 0
    positiveNs = positiveNs+1
  elsif a < 0
    negativeNs = negativeNs+1
  else
    zeroNs = zeroNs+1
  end
end 

puts positiveNs/n
puts negativeNs/n
puts zeroNs/n

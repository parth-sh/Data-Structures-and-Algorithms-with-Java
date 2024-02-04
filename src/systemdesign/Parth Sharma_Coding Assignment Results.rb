# Requirements assumption

# Designing for multiple parking lots
# Ticket is collected at entrances and destroyed at exit
# Parking spot assigned to the vechile, should be nearest to the entrance
# System should not allow, for the vechiles more than the capacity
# types of parking spot, small car, medium vechile, large vechile

class ParkingSpot
    attr_accessor :license_plate
    attr_reader :size
  
    def initialize(size)
      @size = size
      @license_plate = nil
    end
  
    def is_available?
      @license_plate.nil?
    end
  
    def park(license_plate)
      @license_plate = license_plate
    end
  
    def leave
      @license_plate = nil
    end
  end
  
  class ValetParkingSystem
    attr_accessor :spots
  
    def initialize(small, medium, large)
      @spots = {
        small: Array.new(small) { ParkingSpot.new(:small) },
        medium: Array.new(medium) { ParkingSpot.new(:medium) },
        large: Array.new(large) { ParkingSpot.new(:large) }
      }
    end
  
    def admit_the_car(license_plate, car_size)
      suitable_spot = nil
  
      # Find the first available spot based on car size
      case car_size
      when 'small'
        suitable_spot = find_spot([:small, :medium, :large])
      when 'medium'
        suitable_spot = find_spot([:medium, :large])
      when 'large'
        suitable_spot = find_spot([:large])
      end
  
      return 'failure' unless suitable_spot
  
      suitable_spot.park(license_plate)
      'success'
    end
  
    def find_spot(sizes)
      sizes.each do |size|
        @spots[size].each do |spot|
          return spot if spot.is_available?
        end
      end
      nil
    end
  
    def exit_the_car(license_plate)
      @spots.values.flatten.each do |spot|
        if spot.license_plate == license_plate
          spot.leave
          return 'success'
        end
      end
      'failure'
    end
  end
  
  # Example usage
  valet_system = ValetParkingSystem.new(5, 5, 5)
  puts valet_system.admit_the_car('CAR123', 'large')
  puts valet_system.admit_the_car('CAR124', 'large')
  puts valet_system.admit_the_car('CAR125', 'large')
  puts valet_system.admit_the_car('CAR126', 'large')
  puts valet_system.admit_the_car('CAR127', 'large')
  puts valet_system.admit_the_car('CAR128', 'large')
  puts valet_system.exit_the_car('CAR123')
  
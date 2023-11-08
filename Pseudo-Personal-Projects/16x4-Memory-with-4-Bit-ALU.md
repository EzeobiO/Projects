![Screenshot 2023-11-08 131733](https://github.com/EzeobiO/Projects/assets/143557674/b746bbc1-5c4a-43bd-8cba-7d2d95e7e4d6)
Implementing all computer components to be of 4‐bit width or input wherever applicable unless stated otherwise.
For instance:
- The decoder to address the memory will have 4‐bit input (hence 4-to-16 Memory data write address decoder).
- The Multiplexer will have four control or select lines (hence 16-to-1 Memory data read multiplexer).
- The memory (based on a D‐Flip‐Flop for a bit storage) will be 4‐bit addressable (hence 24 = 16 memory locations) and each memory location is holding 4-bit data (randomly initialize all locations with unique binary numbers/values).
- The registers [assume that this computer has three GPRs data registers namely RA, RB and RC, and a SFR Status Register (SReg) called RS with:
  - The Sign (set if MSb of AC=1; this is irrelavant as I am using unsigned integers only for this computer).
  - Overflow (holding the second most significant bit's arithmetic's carryout).
  - Carry (holding the most significant bit's arithmetic's carryout).
  - Zero (set if AC=0) bit.
// All of these four status bits would be shown in this order as LSb to MSb of the RS/SReg]
- The ALU (capable of performing the 4-bit unsigned sum arithmetic, and bit‐wise AND and OR logical operations on RA and RB as well
as a bit-wise NOT on RA only, and the result of each of these four operations, demonstrated one at a time, will be stored in RC)
- The CPU will be of 4‐bit width and capability respectively.

### Note:
There will NOT be carrying out the Fetch (an instruction) and Decode (the instruction and configure ALU using the operation‐code from it); however, the information will be assumed.

ALU will do each of the above four mathematical operations, one at a time) the Execute operation in the FDE cycle of this computer. So, basically, it will be fetching the operands by reading a memory location using the addresses (from the instruction currently being executed) of the two operands (one at a time) and store it into registers RA and RB, and will store the result of the ALU operation after execution of the complete operation into another register RC and subsequently, will write/
store it to a memory location that will be assumed too.

## Video Demonstration
https://github.com/EzeobiO/Projects/assets/143557674/f642e4fc-fb3a-44fb-bcac-b430978fc550




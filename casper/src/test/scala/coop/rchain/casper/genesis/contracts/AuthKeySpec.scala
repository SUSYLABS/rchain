package coop.rchain.casper.genesis.contracts

import coop.rchain.casper.helper.RhoSpec
import coop.rchain.rholang.build.CompiledRholangSource

import scala.concurrent.duration._

class AuthKeySpec
    extends RhoSpec(
      CompiledRholangSource("AuthKeyTest.rho"),
      Seq.empty,
      20.seconds
    )
